package com.example.application.views.view2;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


@Route(value = "view2")
@PageTitle("View 2")
@CssImport("views/view2/view2-view.css")
public class View2View extends Div {

    public View2View() {
        setId("view2-view");
        add(new Label("Content placeholder"));
    }

}
