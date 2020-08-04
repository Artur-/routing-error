package com.example.application.views.view1;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


@Route(value = "view1")
@PageTitle("View 1")
@CssImport("views/view1/view1-view.css")
public class View1View extends Div {

    public View1View() {
        setId("view1-view");
        add(new Label("Content placeholder"));
    }

}
