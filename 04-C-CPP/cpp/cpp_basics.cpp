#include <iostream>


int main()
{
  int  name;
  std::cout << "Enter a your name \n";
  std::cin >> name ;
  int* p = &name;
  std::cout << "Add : " << p << std::endl;
  return 0;
}
