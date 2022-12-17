package com.example.application;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Hello World")
@Route(value = "") // mapped to context root
public class HelloWorld extends VerticalLayout {

    public HelloWorld() {
        var input = new TextField("What's your name?");
        var button = new Button("Say hello", click ->
                add(new Paragraph("Hello, " + input.getValue()))
        );

        add(input, button);
    }
}
