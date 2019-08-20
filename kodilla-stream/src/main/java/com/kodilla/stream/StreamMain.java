package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Example", (text) -> System.out.println(text + "ABC"));
        poemBeautifier.beautify("new example", (text) -> System.out.println(text.toUpperCase()));
        poemBeautifier.beautify("Is this text too long?", (text) -> System.out.println(text.substring(8, 12)));
        poemBeautifier.beautify("glue flower", (text) -> System.out.println(text.replace('g', 'b')));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
