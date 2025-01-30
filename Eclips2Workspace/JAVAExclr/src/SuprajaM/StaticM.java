package SuprajaM;


class India
{
int x;
int y;
static private int z;
static void fun1()
{
z=11;
System.out.println(z);
}
}
class StaticM
{
static public void main(String []args)
{
India.fun1();

}
}