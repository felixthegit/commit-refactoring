package com.github.nymann.commitrefactoring;

import com.intellij.refactoring.listeners.RefactoringEventData;

public interface CodeElementProvider {
    CodeElement create(RefactoringEventData eventData);
}
