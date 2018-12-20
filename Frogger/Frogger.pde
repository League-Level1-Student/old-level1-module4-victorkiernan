//why is this so buggy, as it seems that the constuctor is expecting so many {}, it it almost 
//crazy, not sure if it is due to out of date launcher, misprogramming, or if it is some other 
//error caused by the internal files or other factors of code. I hope I will be able to fix it
//once and if it is fixed delete this extensive report/recommendation/note. 
//If possible work this out later or at home.
int x=200; 
int y=200;
void setup(){
  size(400,400);
}
void draw(){
  
  Car car1 = new Car(200,200,200,3);
Car car2 = new Car(200,200,200,3);
Car car3 = new Car(200,200,200,3);
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
Car car = new Car(carx,cary,carsize,carspeed){
this.carx=carx;
this.cary=y;
this.carsize=carsize;
this.carspeed=carspeed;
}
 void display(){
      fill(0,255,0);
      rect(carx , cary, carsize, 50);
}


}