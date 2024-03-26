package com.adepuu.exercises.session6;

import java.io.*;
import java.util.Scanner;

public class Exercise2 {
    /**
     * Complete the file reader program below
     * and handle all edge cases using try-catch-finally based on the logic given
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isDone = false;

        try {
            System.out.print("Enter the file name: ");
            String fileName = scanner.nextLine();
            readFileContents(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (EOFException e) {
            System.out.println("EOF");
        } catch (IOException e) {
            System.out.println("Something went wrong during reading the file");
        } catch (Exception e) {
            System.out.println("System error! Please try again later");
        }
        finally {
            scanner.close();
        }

    }

    static void readFileContents(String fileName) throws Exception {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            if (e.getClass().equals(FileNotFoundException.class)) {
                throw new FileNotFoundException();
            } else if (e.getClass().equals(EOFException.class)) {
                throw new EOFException();
            } else {
                throw new IOException();
            }
        } catch (Exception e) {
            throw new Exception();
        }
    }
}
