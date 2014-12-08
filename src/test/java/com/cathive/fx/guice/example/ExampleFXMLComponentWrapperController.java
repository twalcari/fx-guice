package com.cathive.fx.guice.example;

import com.google.inject.Injector;
import javafx.fxml.FXML;

import javax.inject.Inject;

/**
 * 
 * @author Benjamin P. Jung
 */
public class ExampleFXMLComponentWrapperController {

    @Inject private Injector injector;

    @FXML SimpleFXMLComponent simpleComponent1;
    @FXML SimpleFXMLComponent simpleComponent2;

    public Injector getInjector() {
        return this.injector;
    }

    public SimpleFXMLComponent getSimpleComponent1() {
        return this.simpleComponent1;
    }

    public SimpleFXMLComponent getSimpleComponent2() {
        return this.simpleComponent2;
    }

}
