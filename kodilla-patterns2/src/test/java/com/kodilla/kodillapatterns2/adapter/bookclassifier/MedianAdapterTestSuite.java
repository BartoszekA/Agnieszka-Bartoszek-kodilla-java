package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Fyodor Dostoyevsky", "Crime and Punishment", 1956, "AB123"));
        bookSet.add(new Book("Antoine de Saint-Exupéry", "The Little Prince", 1945, "CD456"));
        bookSet.add(new Book("Mikhail Bulgakov", "The Master and Margarita", 1967, "EF789"));
        bookSet.add(new Book("Molière", "The Miser", 1668, "GH123"));
        bookSet.add(new Book("Eliza Orzeszkowa", "Gloria victis", 1910, "IJ456"));
        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(1945, median);
    }
}
