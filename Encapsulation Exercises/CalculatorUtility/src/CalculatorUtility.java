public class CalculatorUtility {
        private double[] numbers;

        public CalculatorUtility(double[] numbers)   {
            if (numbers.length !=5)  {
                throw new IllegalArgumentException("Syntax Error!");
            }
            this.numbers = numbers;
        }

        public double getAverage()  {
            double sum = 0;
            for (double num:numbers)    {
                sum += num;
            }
            return sum/numbers.length;
        }

        public double getSmallest() {
            double smallest = numbers[0];
            for (double num:numbers)    {
                if(num<smallest)    {
                    smallest = num;
                }
            }
            return smallest;
        }

        public double getLargest() {
            double largest = numbers[0];
            for (double num : numbers) {
                if (num > largest) {
                    largest = num;
                }
            }
            return largest;
        }

}