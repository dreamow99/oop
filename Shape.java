package DrawProgram;

import java.util.*;

/**
* class Shape bieu dien hinh khoi
*/
public class Shape extends Layer
{
	private double posX;
	private double posY;
	private double size;
	private String color;
	/**
	* constructor
	*/
	public Shape(double x, double y, double size, String color){
		this.posX = x;
		this.posY = y;
		this.size = size;
		this.color = color;
	}
	/**
	*getter
	*/
	public Double getPosX(){
		return this.posX;
	}
	/**
	* getter
	*/
	public void setPosX(double val){
		this.posX = val;
	}
	/**
	*getter
	*/
	public Double getPosY(){
		return this.posY;
	}
	/**
	* getter
	*/
	public void setPosY(double val){
		this.posY = val;
	}
	/**
	*getter
	*/
	public double getSize(){
		return this.size;
	}
	/**
	* getter
	*/
	public void setSize(double val){
		this.size = val;
	}
	/**
	* getter
	*/
	public String getColor(){
		return this.color;
	}
	/**
	* setter
	*/
	public void setColor(String color){
		this.color = color;
	}
	/**
	* move shapes
	*/
	public void move(double x, double y){
		this.posX += x;
		this.posY += y;
	}
	/**
	*print info
	*/
	public void getInfo(){
		System.out.println("bottom left coordinate: " + this.getPosX() + " " + this.getPosY() + "; color: " + this.getColor());
	}
}
