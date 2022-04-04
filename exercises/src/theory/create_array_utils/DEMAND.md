# Demand

In actual development, we often encounter some tool classes used by arrays. Please write an array tool class as follows:
ArraysUtils;

1. We know that when an array object is directly output, it is the address of the output object, and many places in the
   project need to return the contents of the array. Please provide a tool class method toString in ArraysUtils to
   return the contents of the int array. The returned string format is as follows: [10,20,50,34,100] (only int array and
   only one-dimensional array are considered);
2. It is often necessary to count the average value. The average value is the score after removing the lowest score and
   the highest score. Please provide such a tool method getAverage to return the average score. (only float array and
   only one-dimensional arrays are considered);
3. define a test class RunApp, call the tool method of the tool class, and return the result;