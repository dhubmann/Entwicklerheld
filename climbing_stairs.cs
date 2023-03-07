using System;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualBasic;

namespace ClimbingStairsImplementation
{
    public static class ClimbingStairs
    {
        public static int CalculateClimbingStairs(int numberOfStairs) {

            int result;

                if (numberOfStairs <= 0)
                {
                    result = 0;
                }
                else if (numberOfStairs == 1)
                {
                    result = 1;
                }
                else
                {
                    List<int> stairsList = new List<int>();
                    stairsList.Add(1);
                    stairsList.Add(2);

                    while (stairsList.Count < numberOfStairs)
                    {
                        int secondToLast = stairsList.ElementAt(stairsList.Count - 2);
                        int last = stairsList.ElementAt(stairsList.Count - 1);
                        int sum = secondToLast + last;
                        stairsList.Add(sum);
                    }
                    result = stairsList.ElementAt(stairsList.Count - 1);
                }
                return result;

            throw new Exception("No Implementation");
        }
    }
}