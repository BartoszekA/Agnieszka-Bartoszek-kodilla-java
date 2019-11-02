package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    public Library createLibrary() {
        Library library = new Library("My library");
        IntStream.iterate(1, n-> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("Title #" + n, "Author #" + n, LocalDate.now())));
        return library;
    }

    @Test
    public void testGetBooksShallowCopy() throws CloneNotSupportedException {
        //Given
        Library library = createLibrary();
        Library clonedLibrary = library.shallowCopy();
        clonedLibrary.setName("My cloned library");

        //When
        library.getBooks().clear();

        //Then
        Assert.assertEquals(0, library.getBooks().size());
        Assert.assertEquals(0, clonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
    }

    @Test
    public void testGetBooksDeepCopy() throws CloneNotSupportedException {
        //Given
        Library library = createLibrary();
        Library deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("My library - deep cloned");

        //When
        library.getBooks().clear();

        //Then
        Assert.assertEquals(0, library.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
