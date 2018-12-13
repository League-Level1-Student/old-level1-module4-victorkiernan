int x=200; 
int y=200;
void setup(){
  size(400,400);
}
void draw(){
background(209,100,10);
Car car = new Car(100,100,300,20);
fill(200,0,0);
ellipse(x,y,50,50);
NOESCAPE();
}
void keyPressed(){
if(key == CODED){
if(keyCode == UP){
y-=5;    //Frog Y position goes up
}
else if(keyCode == DOWN){
y+=5;    //Frog Y position goes down
}
else if(keyCode == RIGHT){
x+=5;    //Frog X position goes right
}
else if(keyCode == LEFT){
x-=5;  //Frog X position goes left
}
}
}
void NOESCAPE(){
if(x==0){
x=200;
y=200;
}
else if(y==0){
y=200;
x=200;
}
else if(x==400){
y=200;
x=200;
}
else if(y==400){
y=200;
x=200;
}
}
class Car{
int carx;
int cary;
int carsize;
int carspeed;
int mph=carspeed;
int x;
Car(carx,cary,carsize,carspeed){
this.carx=x
this.cary=y
this.carsize=carsize
this.carspeed=carspeed}
} 

void display()
{
      fill(0,255,0);
      rect(carx , cary, carsize, 50);
}