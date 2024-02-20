package guru.springframework.di.diproject.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DataSourceControllerTest {

    @Autowired
    DataSourceController controller;
    @Test
    void getDataSource() {
        assertEquals("Dev",controller.getDataSource());
    }
}