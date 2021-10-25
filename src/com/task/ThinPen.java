package com.task;

public class ThinPen implements Pen {

  final BrushSize brushSize = BrushSize.THIN;
  private String color = null;

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void draw(String content) {
    System.out.println("Pen Thin : "+content +" in color : " + color);
  }
}
