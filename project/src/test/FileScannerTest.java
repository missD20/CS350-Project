package edu.odu.cs.cs350;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the FileScanner class.
 */
public class FileScannerTest {

    private FileScanner scanner;

    @BeforeEach
    public void setUp() {
        scanner = new FileScanner();
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals("", scanner.getFilePath());
        assertEquals("", scanner.getFileType());
        assertEquals("", scanner.getFileContent());
    }
}