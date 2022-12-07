package day35_InterviewPracticeNumbers;

public class Topic6_BestTimeToBuyStock {
    public static void main(String[] args) {
            // prices {7,1,5,3,6,4}
        //print maximum profit
        // buy it when it is in the lowest price
        // sell it when it is in the highest price

//     Day 1 = Selling price 7
//     Day 2 = Selling price 1
//     Day 3 = Selling price 5
//     Day 4 = Selling price 3
//     Day 5 = Selling price 6
//     Day 6 = Selling price 4

//        buy it when is 1
//        if we sell when it is 5 the profit will be 4:
//        if we sell when it is 3 the profit will be 2:
//        if we sell when it is 6 the profit will be 5: <---- Max Profit
//        if we sell when it is 4 the profit will be 3:

        int[] data = {7,1,5,3,6,4};
        int Profit = MaxProfit(data);
        System.out.println("The max profit you can make is $"+Profit);
    }

    public static int MaxProfit(int[] param1){
//        {7,1,5,3,6,4}
        // find the lowest value to buy
        int BuyingPrice = param1[0];
        int profit = 0;
        for (int i = 1; i < param1.length; i++) {
            //if we find the lowest value to buy, your buyingprice will be equal to that
            if (BuyingPrice > param1[i]){
                BuyingPrice = param1[i];
            }
            else {
                // what profit I will make if I sell it
//                buying price 1 - selling price 5 - my profit = 4
                int Newprofit = param1[i] - BuyingPrice; //newprofit become 4
                if(Newprofit > profit){
                    profit=Newprofit;
                }
            }
        }

        return profit;
    }
}
