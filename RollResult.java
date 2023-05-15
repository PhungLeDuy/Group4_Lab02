import java.util.*;
/*
JDice: Java Dice Rolling Program
Copyright (C) 2006 Andrew D. Hilton  (adhilton@cis.upenn.edu)


This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

 */


public class RollResult {
    int total; // thiếu khoảng trắng giữa int và total
    int modifier;
    Vector<Integer> rolls;

    private RollResult(int total, int modifier,Vector<Integer> rolls){ // bỏ  dấu / 
	this.total=total;
	this.modifier=modifier;
	this.rolls=rolls;
    }

    public RollResult(int bonus) { // thừa chữ s RollsResult
	this.total=bonus;
	this.modifier=bonus;
	this.rolls=new Vector<Integer>();// thiếu this
    }

    public void addResult(int res){
	total += res; // thiếu ;
	rolls.add(res);
    }

    public RollResult andThen(RollResult r2) {
	int total=this.total+r2.total;
	Vector<Integer> rolls=new Vector<Integer>();
	rolls.addAll(this.rolls);
	roll.saddAll(r2.rolls);// thiếu .
	return new RollResult(total, this.modifier+r2.modifier, rolls); // xóa khoảng trắng khó nhìn code
    }

    public String toString() {
	return total +"  <= " +rolls.toString()+ 
	    (modifier>0?("+"+modifier):
	     modifier<0?modifier:"");
    }


}
