package com.task;

public class MediumPen implements Pen {

  final BrushSize brushSize = BrushSize.MEDIUM;
  private String color = null;

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void draw(String content) {
    System.out.println("Pen MEDIUM : " +content+" in color : " + color);

  }
}
