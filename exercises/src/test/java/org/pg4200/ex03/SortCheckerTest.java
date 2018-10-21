package org.pg4200.ex03;

public class SortCheckerTest extends SortCheckerTestTemplate {
    @Override
    protected SortChecker getNewInstance() {
        return new MySortChecker();
    }
}
