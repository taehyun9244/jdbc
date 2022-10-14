package hello.jdbc.exception.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CheckedTest {

    static class MyCheckedException extends Exception {
        public MyCheckedException(String message) {
            super(message);
        }
    }

    static class Service {

    }

    static class Repository {
        public void call() throws MyCheckedException {
            throw new MyCheckedException("ex");
        }
    }
}
