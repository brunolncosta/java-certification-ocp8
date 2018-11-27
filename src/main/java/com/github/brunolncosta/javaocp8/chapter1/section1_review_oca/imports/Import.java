package com.github.brunolncosta.javaocp8.chapter1.section1_review_oca.imports;

// The package java.lang is automatic imported by any java class.
// It provide basic class support, it where is the String class for example.
// You can declare it explicitly if you want do so.
//import java.lang.*;

// These are common class import.
import java.util.ArrayList;
import java.util.List;

// The word "*" in the and of the import declaration,
// means that you want to import every class in the package.
// NOTE that this is a redundant import because ArrayList and List are already imported, but it compiles any way.
import java.util.*;

// There is a special way to import static members of another class.
// It is the import static, once you import the static members,
// they behavior as if they are declared in the class are importing them.
import static java.util.Arrays.asList;

public class Import {

    private List<String> list = new ArrayList<>();

    public void fillList() {
        // There is no need to write "Arrays.asList" because it is static imported.
        this.list = asList("first", "second");
    }

}
