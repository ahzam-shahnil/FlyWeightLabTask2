package com.task;

public class DemoPen {
  public static void main(String[] args) {
    String work = "We are Doing Fly Weight Lab Task !!";

    Pen thickPen = PenFactory.getThickPen("YELLOW");
    thickPen.draw(work);

    Pen mediumPen = PenFactory.getMediumPen("YELLOW");
    mediumPen.draw(work);

    Pen thinPen = PenFactory.getThinPen("BLUE");
    thinPen.draw(work);

  }
}
