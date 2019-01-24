int x=200; 
int y=200;
void setup(){
  size(400,400);
}
void draw(){
  
  Car car1 = new Car(200,300,200,3);
car1.display();
car1.move();
Car car2 = new Car(200,200,200,3);
car2.display();
car2.move();
Car car3 = new Car(200,100,200,3);
car3.display();
car3.move();
background(209,100,10);
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
Car(int carx,int cary,int carsize,int carspeed){
this.carx=carx;
this.cary=cary;
this.carsize=carsize;
this.carspeed=carspeed;
}
 void display(){
      fill(0,255,0);
      rect(carx , cary, carsize, 50);
}
void move(){
carx=carx-=10;
if(carx==0){
carx=400;
}
}
void moveother(){
carx=carx+=10;
if (carx==400){
carx=0;}
}
void getx(){
println(carx);
}
void gety(){
println(cary);
}
void getSize(){
println(carsize);
}
}
 boolean intersects(Car car) {
      if ((y > car.getY() && y < car.getY()+50) && (x > car.getX() && x < car.getX()+car.getSize()))
      {
             return true;
      }
      else
      {
             return false;
      }
 }