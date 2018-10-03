# Chapter 4 Project

For this project, you will complete the Boat class. A boat has x and y coordinates in a two-dimensional plane. It can turn and move, as well as provide information regarding its position and heading. Its direction is given in degrees. It starts with a heading of 0 degrees. This is the same as Programming Project 4.4 in the book.

To successfully complete this project, you will need to use  Math functions, particularly sin(double) and cos(double). Note that both of these functions assume that their parameters are in radians, not degrees. You will therefore have to convert your heading into radians to get the correct answer. The Math class has the constant PI, which you can access by calling Math.PI. Remember that 360 degrees is 2*PI radians. Additionally, in standard directions, 0 degrees is north, whereas in trigonometry, it is due east. Because of this, the x component of a vector is calculated as sine and y component is calculated as cosine.
