# Audio Transcribe

A Spring Boot application for uploading audio files and converting speech into text.

## Features

* Upload audio files through a web interface
* Process uploaded audio for transcription
* REST APIs for file upload and transcription
* Simple HTML frontend
* Spring Boot backend
* Maven-based project

## Tech Stack

* **Java**
* **Spring Boot**
* **Maven**
* **HTML/CSS/JavaScript**
* Audio transcription service/API

## Project Structure

```text
audio-transcribe/
├── .mvn/
│   └── wrapper/
├── src/
│   ├── main/
│   │   ├── java/com/audio/transcribe/
│   │   │   ├── AudioTranscribeApplication.java
│   │   │   ├── FileUploadController.java
│   │   │   ├── TestController.java
│   │   │   └── TranscriptionController.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   │           └── upload.html
│   └── test/
│       └── java/com/audio/transcribe/
│           └── AudioTranscribeApplicationTests.java
├── .gitignore
├── .gitattributes
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## Requirements

Before running the application, make sure you have:

* Java 17 or later
* Maven (optional because the project includes Maven Wrapper)
* An API key if your transcription service requires one

Check your Java installation:

```bash
java -version
```

## Configuration

Configure the required application properties in:

```text
src/main/resources/application.properties
```

If your application uses an API key, **do not commit the real API key to GitHub**.

For example:

```properties
# Example only
transcription.api.key=YOUR_API_KEY
```

Use environment variables or another secure configuration method for production.

## Running the Application

### Windows

Using Maven Wrapper:

```bash
mvnw.cmd spring-boot:run
```

### Linux/macOS

```bash
./mvnw spring-boot:run
```

Or, if Maven is installed:

```bash
mvn spring-boot:run
```

The application will normally start on:

```text
http://localhost:8080
```

## Using the Application

1. Start the Spring Boot application.
2. Open the application in your browser.
3. Open the audio upload page.
4. Select an audio file.
5. Upload the file.
6. The application processes the audio and returns the transcription.

## API

The application provides endpoints for audio upload and transcription through the controllers in:

```text
src/main/java/com/audio/transcribe/
```

### File Upload

The file upload functionality is handled by:

```text
FileUploadController.java
```

### Transcription

The transcription functionality is handled by:

```text
TranscriptionController.java
```

The exact endpoints and request format depend on the current controller implementation.

## Testing

Run the tests with:

```bash
mvnw.cmd test
```

Or on Linux/macOS:

```bash
./mvnw test
```

## Build

Create a production JAR:

```bash
mvnw.cmd clean package
```

The generated JAR will be located in:

```text
target/
```

## Git

Initialize the repository:

```bash
git init
```

Add files:

```bash
git add .
```

Create a commit:

```bash
git commit -m "initial commit"
```

Check repository status:

```bash
git status
```

## Security

Never commit sensitive information such as:

* API keys
* Passwords
* Access tokens
* Private credentials
* `.env` files containing secrets

Use environment variables or a secure secret-management solution instead.

## Future Improvements

* Add support for more audio formats
* Improve transcription accuracy
* Add authentication
* Add transcription history
* Add progress indicators for large files
* Improve error handling
* Add a database for storing transcriptions
* Deploy the application to a cloud platform

## License

This project is currently intended for personal/educational use.
Add an appropriate open-source license if you plan to distribute the project publicly.
