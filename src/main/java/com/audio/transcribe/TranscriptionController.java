package com.audio.transcribe;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.File;
import java.io.IOException;

@RestController
public class TranscriptionController {

    @Value("${openai.api.key}")
    private String apiKey;

    private final WebClient webClient = WebClient.create("https://api.openai.com");

    @PostMapping("/transcribe")
    public String transcribe(@RequestParam("file") MultipartFile file) throws IOException {

        if (file.isEmpty()) {
            return "No file uploaded ❌";
        }

        File temp = File.createTempFile("audio-", ".wav");
        file.transferTo(temp);

        MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        body.add("file", new FileSystemResource(temp));
        body.add("model", "whisper-1");

        String response = webClient.post()
                .uri("/v1/audio/transcriptions")
                .header("Authorization", "Bearer " + apiKey)
                .contentType(MediaType.MULTIPART_FORM_DATA)
                .bodyValue(body)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        temp.delete();
        return response;
    }
}
