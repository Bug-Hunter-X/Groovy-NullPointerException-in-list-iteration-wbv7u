# Groovy NullPointerException Handling in List Iteration

This example demonstrates a common Groovy NullPointerException that arises when iterating over a list that may be null.

## The Problem

The `myMethod` function attempts to iterate over a list using the `each` method. However, if a null list is passed, a `NullPointerException` is thrown because the `each` method can't operate on a null object.

## The Solution

The solution involves adding a null check before iterating.  This ensures that the `each` method only operates on a non-null list, preventing the exception.

## How to reproduce:

1. Save the code in `BuggyGroovyList.groovy`
2. Run it using groovy BuggyGroovyList.groovy
3. Observe the NullPointerException
4. Replace it with `FixedGroovyList.groovy` and run again
5. The NullPointerException is avoided
