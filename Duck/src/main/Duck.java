package main;
import attack.*;
import defense.*;
import fly.*;
import sound.*;
public class Duck 
{
    private AttackBehaviour attackBehaviour;
    private DefenseBehaviour defenseBehaviour;
    private FlyBehaviour flyBehaviour;
    private SoundBehaviour SoundBehaviour;
    public Duck(AttackBehaviour a , DefenseBehaviour b , FlyBehaviour c , SoundBehaviour d)
    {
    	this.attackBehaviour = a;
    	this.defenseBehaviour = b;
    	this.flyBehaviour = c;
    	this.SoundBehaviour = d;
    }
    public void attack()
    {
    	attackBehaviour.attack();
    }
    public void defense()
    {
    	defenseBehaviour.defense();
    }
    public void fly()
    {
    	flyBehaviour.fly();
    }
    public void sound()
    {
    	SoundBehaviour.sound();
    }
}