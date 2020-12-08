package com.sava;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Words: " + countWords(args[0]));
        System.out.println("Sentences: " + countSentences(args[0]));
        System.out.println("Characters: " + countChar(args[0]));
        System.out.printf("The score is: %.2f\n", countScore(args[0]));
        gradeLevel(args[0]);
    }

    public static void gradeLevel(String path) {
        int score = (int) Math.ceil(countScore(path));
        switch (score) {
            case 1:
                System.out.println("This text should be understood by 5-6 year olds.");
                break;
            case 2:
                System.out.println("This text should be understood by 6-7 year olds.");
                break;
            case 3:
                System.out.println("This text should be understood by 7-9 year olds.");
                break;
            case 4:
                System.out.println("This text should be understood by 9-10 year olds.");
                break;
            case 5:
                System.out.println("This text should be understood by 10-11 year olds.");
                break;
            case 6:
                System.out.println("This text should be understood by 11-12 year olds.");
                break;
            case 7:
                System.out.println("This text should be understood by 12-13 year olds.");
                break;
            case 8:
                System.out.println("This text should be understood by 13-14 year olds.");
                break;
            case 9:
                System.out.println("This text should be understood by 14-15 year olds.");
                break;
            case 10:
                System.out.println("This text should be understood by 15-16 year olds.");
                break;
            case 11:
                System.out.println("This text should be understood by 16-17 year olds.");
                break;
            case 12:
                System.out.println("This text should be understood by 17-18 year olds.");
                break;
            case 13:
                System.out.println("This text should be understood by 18-24 year olds.");
                break;
            case 14:
                System.out.println("This text should be understood by 24+ year olds.");
                break;
        }
    }

    public static double countScore(String path) {
        double characters = countChar(path);
        double sentences = countSentences(path);
        double words = countWords(path);
        double score = 0;

        score = 4.71 * (characters / words) + 0.5 * (words / sentences) - 21.43;
        return score;

    }

    public static int countChar(String path) {
        int countChar = 0;
        File file = new File(path);
        try(Scanner sc = new Scanner(file)) {
            countChar = sc.nextLine().replaceAll("\\s", "").split("").length;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return countChar;
    }

    public static int countSentences(String path) {
        File file = new File(path);
        int countSenteces = 0;
        String regex = "[!.?]\\s+";

        try(Scanner sc = new Scanner(file)) {
            String[] arr = sc.nextLine().split(regex);
            countSenteces = arr.length;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return countSenteces;

    }

    public static int countWords(String path) {
        File file = new File(path);
        int countWord = 0;

        try(Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                sc.next();
                countWord++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return countWord;

    }
}
