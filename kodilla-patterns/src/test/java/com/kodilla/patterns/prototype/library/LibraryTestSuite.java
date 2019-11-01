package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        //When
        Library library = new Library("My library");
        IntStream.iterate(1, n-> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("Title #" + n, "Author #" + n, LocalDate.now())));

        //Then
        Assert.assertEquals(5, library.getBooks().size());
    }
}
