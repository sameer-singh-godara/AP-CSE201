Assumptions:
1. I have made different ID's for Different Objects of Different Classes, which are starting from 0.
2. While Updating/Removing/Visiting/Viewing any Event or Object, you must know the ID of the Object.
3. We have to set the age limit by ourselves, else the limit for age will be from 0 to Maximum Value of Integer.
4. While Adding an Attraction, it is added, by default in Closed State, therefore we have to set the Attraction to Open in Schedule Events Section or Update Section.
5. Only Ticketed Visitors Are Added to particular Attraction.
6. All Visitors (whether ticketed or non-ticketed visitor) for Particular Attraction, who Visited that attraction, is Taken in Account for Most Popular Attraction.
7. Every Discount is by default in Valid State (open).




Main:
1. First of all, I have Admin as Parent Class which is extending to Visitor Class, so I have used Inheritance.
2. I have used Interface Events which is implemented in 2 Classes Animal and Attraction.
3. I have used Animals as an Abstract Parent Class whose Sub-Classes are Mammal, Reptile, and Amphibian, hence Inheritance is also used here.
4. I have used Polymorphism while implementing getFeed and description method in Animal and is over-ridded in all the Sub-Classes of Animal.
5. I have over-ridded the to-String method of Object Class in Animal and it's Sub-Classes.
6. I have used to-String and equalsTo as Object Class Methods.
7. I have Created a Abstract Class named Offer for Over-ridding the abstract method