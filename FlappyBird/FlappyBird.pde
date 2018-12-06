float pipex=600;
float grav=0.2;
float y=100;
float vel=2;
float pipeWidth= 50;
float speed=-5;
int backgroundcolor=100;
int backgroundcolor1=0;
int backgroundcolor2=0;
int upperPipeHeight = (int) random(100,400);
int lowerPipeHeight = (int) random(100,400);
int color0;
int color1=100;
int color2;
int frames=60;
void setup() {
size(600,600);
}

void draw() {
background(backgroundcolor,backgroundcolor1,backgroundcolor2);
fill(255,2,3);
ellipse(300,y,50,50);
y+=vel;
vel+=grav;
fill(color0,color1,color2);
rect(pipex,0,pipeWidth,upperPipeHeight);
fill(color0,color1,color2);
rect(pipex,lowerPipeHeight,pipeWidth,400);
pipex+=speed;
teleportPipes();

}
void mousePressed(){
vel=-3;
}
void keyPressed(){
  if(keyCode==' '){
   text("Warning this is an epilepitic game" ,250,200 );}
}
void teleportPipes(){
if(pipex<=-50){
pipex=600;
upperPipeHeight = (int) random(010,300);
lowerPipeHeight = (int) random(300, 500);
backgroundcolor = (int) random(0, 255);
backgroundcolor1 = (int) random(0, 255);
backgroundcolor2 = (int) random(0, 255);
color0 = (int) random(0, 255);
color1 = (int) random(0, 255);
color2 = (int) random(0, 255);
speed-=0.15;

}
}
boolean intersectsPipes() {
     if (y < upperPipeHeight && vel > pipex && vel < (pipex+pipeWidth)){
          return true; }
     else if (y>lowerPipeHeight && vel > pipex && vel < (pipex+pipeWidth)) {
          return true; }
     else { return false; }
} 