package config;

import com.codeborne.selenide.Selenide;

public class TestConfiguration {

    public TestConfiguration(){


        Selenide.open("https://parabank.parasoft.com/parabank/services.htm");
    }
}
