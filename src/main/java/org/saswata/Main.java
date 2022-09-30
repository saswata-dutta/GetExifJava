package org.saswata;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ImageProcessingException, IOException {
        File jpegFile = new File("image.jpeg");
        Metadata metadata = ImageMetadataReader.readMetadata(jpegFile);

        for (Directory directory : metadata.getDirectories()) {
            for (Tag tag : directory.getTags()) {
                System.out.println(tag);
            }
        }
    }
}
