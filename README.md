# audio-transcribe

Audio Transcribe

A simple Spring Boot application that converts audio files into text using OpenAI's audio transcription API.

Features
Upload audio files
Convert speech to text
Simple web interface
OpenAI audio transcription
REST API
Technologies
Java
Spring Boot
Spring AI
Maven
OpenAI API
HTML, CSS, JavaScript
Setup

Set your OpenAI API key as an environment variable.

Windows
set OPENAI_API_KEY=your_api_key
Linux / macOS
export OPENAI_API_KEY=your_api_key
Run the Application
Windows
mvnw.cmd spring-boot:run
Linux / macOS
./mvnw spring-boot:run

Open:

http://localhost:8080/upload.html
Configuration

The API key is configured in application.properties:

openai.api.key=${OPENAI_API_KEY}
spring.ai.openai.audio.transcription.model=whisper-1

Never commit your actual API key to GitHub.

Project Structure
src/
├── main/
│   ├── java/com/audio/transcribe/
│   │   ├── AudioTranscribeApplication.java
│   │   ├── FileUploadController.java
│   │   ├── TestController.java
│   │   └── TranscriptionController.java
│   └── resources/
│       ├── application.properties
│       └── static/upload.html
└── test/
Author

Rohan Pawar

GitHub: https://github.com/rohanpawar2510/audio-transcribe
