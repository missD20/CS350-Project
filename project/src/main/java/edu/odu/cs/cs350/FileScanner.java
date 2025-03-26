package edu.odu.cs.cs350;

/**
 * Represents scanning file.
 */   

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Represents a file to be scanned, including its path, type, and content.
 */
public class FileScanner {

    private String filePath;
    private String fileType;
    private String fileContent;

    /**
     * Default constructor.
     */
    public FileScanner() {
        filePath = "";
        fileType = "";
        fileContent = "";
    }

    /**
     * Constructor with parameters.
     *
     * @param filePath    the path to the file
     * @param fileType    the MIME type of the file
     * @param fileContent the content of the file
     */
    public FileScanner(String filePath, String fileType, String fileContent) {
        this.filePath = filePath;
        this.fileType = fileType;
        this.fileContent = fileContent;
    }

    /**
     * Get the file path.
     *
     * @return the file path
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Set the file path.
     *
     * @param filePath the file path to set
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Get the file type (MIME type).
     *
     * @return the file type
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Set the file type.
     *
     * @param fileType the file type to set
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * Get the file content.
     *
     * @return the content of the file
     */
    public String getFileContent() {
        return fileContent;
    }

    /**
     * Set the file content.
     *
     * @param fileContent the file content to set
     */
    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    /**
     * Reads the file content and sets both the fileContent and fileType properties.
     *
     * @throws IOException if the file cannot be read
     */
    public void scanFile() throws IOException {
        Path path = Paths.get(filePath);
        fileContent = Files.readString(path);
        fileType = Files.probeContentType(path);
    }

    /**
     * Returns a string representation of the scanned file.
     *
     * @return a string summary of file path and type
     */
    @Override
    public String toString() {
        return "FileScanner[filePath=" + filePath + ", fileType=" + fileType + "]";
    }
}
