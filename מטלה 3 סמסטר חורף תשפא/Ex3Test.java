package Ex3;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Ex3Test {
/*
	@Test
	void testMoveCharToLast() {
		String in = "hello world, let's go!";
		String out = "heo word, et's go!llll";
		assertTrue(out.equals(Ex3.moveCharToLast(in,'l')));
		in = "&hi&hi&";
		out = "hihi&&&";
		assertTrue(out.equals(Ex3.moveCharToLast(in,'&')));
		String in1 = "assassstrew";
		String out1 = "aatrewsssss";
		assertTrue(out1.equals(Ex3.moveCharToLast(in1,'s')));
		String in2 = "assassin's creed";
		String out2 = "ssssin's creedaa";
		assertTrue(out2.equals(Ex3.moveCharToLast(in2,'a')));
		String in3 = "aaaaa";
		String out3 = "aaaaa";
		assertTrue(out3.equals(Ex3.moveCharToLast(in3,'a')));

	}
	
	@Test
	void testReduce() {
		String in = "aaabbccccxxxyzz";
		String out = "abcxyz";
		assertTrue(out.equals(Ex3.reduce(in)));
		in = "abcda";
		out = in;
		assertTrue(out.equals(Ex3.reduce(in)));
		in = "bees stooopppp whyyyyyyyy";
		out ="bes stop why";
		assertTrue(out.equals(Ex3.reduce(in)));
		in = "a a a a a a a a a";
		out = in;
		assertTrue(out.equals(Ex3.reduce(in)));
	}
	
	@Test
	void testMySplit() {
		assertEquals(Ex3.mySplit(new int[] {1,1}),true);
		assertEquals(Ex3.mySplit(new int[] {1,1,1}),false);
		assertEquals(Ex3.mySplit(new int[] {2,4,2}),true);
		assertEquals(Ex3.mySplit(new int[] {5,21,8,15,7}),true);
		assertEquals(Ex3.mySplit(new int[] {15,10,5}),false);
		assertEquals(Ex3.mySplit(new int[] {15,8,7}),true);
		assertEquals(Ex3.mySplit(new int[] {3,3,3,3,3,15}),true);
		assertEquals(Ex3.mySplit(new int[] {3,6,3,6,15,4,1}),true);
		assertEquals(Ex3.mySplit(new int[] {7,5,2,3,10}),false);
	}
	
	@Test
	void testSumOfNeighbours() {
		int[][] mat1 = {{3,5,7,5},{-4,2,10,11},{9,-50,3,60}};
		int[][] matOut1 = {{3,18,33,28},{-31,-17,43,85},{-52,20,33,24}};
		mat1 = Ex3.sumOfNeighbours(mat1);
		for(int i=0; i < mat1.length ;++i)
			assertTrue(Arrays.equals(mat1[i], matOut1[i]));
		int[][] mat2 = {{1,-2},{4,1}};
		int[][] matOut2 = {{3,6},{0,3}};
		mat2 = Ex3.sumOfNeighbours(mat2);
		for(int i=0; i < mat2.length ;++i)
			assertTrue(Arrays.equals(mat2[i], matOut2[i]));
		int sum1[][] = {{7,7,7}, {7,7,7}, {7,7,7}, {7,7,7}};
		int sum1out[][] = {{21, 35, 21}, {35, 56, 35}, {35, 56, 35}, {21, 35, 21}};
		sum1 = Ex3.sumOfNeighbours(sum1);
		for(int i=0; i < sum1.length ;++i)
			assertTrue(Arrays.equals(sum1[i], sum1out[i]));
		int sum2[][] ={{7,9,7,-19}, {1,2,-3,-4}, {7,-4,7,0}, {7,7,7,6}, {-9,8,-13,5}};
		int sum2out[][] ={{12, 14, -15, 0}, {21, 31, -2, -8}, {13, 35, 11, 13}, {9, 10, 16, 6}, {22, -1, 33, 0}};
		sum2 = Ex3.sumOfNeighbours(sum2);
		for(int i=0; i < sum1.length ;++i)
			assertTrue(Arrays.equals(sum2[i], sum2out[i]));


	}
	
	@Test
	void testCaesarCipherText() {
		String in = "abcdefghijklmnopqrstuvwxyz ";
		String out = "efghijklmnopqrstuvwxyzabcd ";
		assertTrue(out.equals(Ex3.caesarCipherText(in, 4)));
		assertTrue(in.equals(Ex3.caesarCipherText(Ex3.caesarCipherText(in, 4),-4)));
		String in1 = "asaf kuty";
		String out1 = "hzhm rbaf";
		assertTrue(out1.equals(Ex3.caesarCipherText(in1, 7)));
		assertTrue(in1.equals(Ex3.caesarCipherText(Ex3.caesarCipherText(in1, 7),-7)));
		String in2 = "";
		String out2 = "";
		assertTrue(out2.equals(Ex3.caesarCipherText(in2, 5)));
		assertTrue(in2.equals(Ex3.caesarCipherText(Ex3.caesarCipherText(in2, 5),-5)));
		String in3 = "asaf kuty";
		String out3 = "";
		assertTrue(out3.equals(Ex3.caesarCipherText(in3, 27)));
		String in4 = "hello";
		String out4 = "hello";
		assertTrue(out4.equals(Ex3.caesarCipherText(in4, 26)));
		assertTrue(in4.equals(Ex3.caesarCipherText(Ex3.caesarCipherText(in4, 26),-26)));


	}
	
	@Test
	void testVigenereCipherText() {
		String in = "a simple example";
		String out = "a zqqkpq rqaowti";
		assertTrue(out.equals(Ex3.vigenereCipherText(in, "achievement")));
		in = "impressive student from ariel university";
		out = "pacfvzgvjv ggiulbg wycz rywrz bbvjvygvhp";
		assertTrue(out.equals(Ex3.vigenereCipherText(in, "honor")));
		in = "test";
		out = "test";
		assertTrue(out.equals(Ex3.vigenereCipherText(in, "a")));
		in = "vikings attack";
		out = "yiwvqge dtfnfk";
		assertTrue(out.equals(Ex3.vigenereCipherText(in, "damn")));

	}
	
	@Test
	void testVigenereDecipherText() {
		String in = "a simple example";
		String key = "achievement";
		assertTrue(in.equals(Ex3.vigenereDecipherText(Ex3.vigenereCipherText(in,key),key)));
		String in1 = "dont you know";
		String key1 = "poly";
		assertTrue(in1.equals(Ex3.vigenereDecipherText(Ex3.vigenereCipherText(in1,key),key)));
	}


 */






		//  1 point
		@Test
		void testMoveCharToLast() {
			String in = "hello world, let's go!";
			String out = "heo word, et's go!llll";
			assertTrue(out.equals(Ex3.moveCharToLast(in,'l')));
		}

		//  1 point
		@Test
		void testMoveCharToLast2() {
			String in = "&hi&hi&";
			String out = "hihi&&&";
			assertTrue(out.equals(Ex3.moveCharToLast(in,'&')));
		}

		//  1 point
		@Test
		void testMoveCharToLastMoreTests() {
			String in = "hakuna matata";
			String out = "akuna matatah";
			assertEquals(out, Ex3.moveCharToLast(in,'h'));
		}

		//  1 point
		@Test
		void testMoveCharToLastMoreTests2() {
			String in = "akuna matatah";
			String out = "kun mtthaaaaa";
			assertEquals(out, Ex3.moveCharToLast(in,'a'));
		}

		//  1 point
		@Test
		void testMoveCharToLastMoreTests3() {
			String in = "Cogito ergo sum";
			String out = "Cogitoergosum  ";
			assertEquals(out, Ex3.moveCharToLast(in,' '));
		}

		//  1 point
		@Test
		void testMoveCharToLastMoreTests4() {
			String out = "Cogitoergosum  ";
			String in = "cCogitoergosum  ";
			assertEquals(out+'c', Ex3.moveCharToLast(in,'c'));
		}

		//  1 point
		@Test
		void testMoveCharToLastMoreTests5() {
			String in = "cCogitoergosum  ";
			String out = "cogitoergosum  C";
			assertEquals(out, Ex3.moveCharToLast(in,'C'));
		}

		//  1 point
		@Test
		void testMoveCharToLastMoreTests6() {
			String in = "I think, therefore I am";
			String out = "I think therefore I am,";
			assertEquals(out, Ex3.moveCharToLast(in,','));
		}

		//  1 point
		@Test
		void testMoveCharToLastMoreTests7() {
			String in = "I think therefore I am,";
			String out = " think therefore  am,II";
			assertEquals(out, Ex3.moveCharToLast(in,'I'));
		}

		//  2 points
		@Test
		void testMoveCharToLastEdgeCases() {
			String in = "hello  world, let's go!";
			assertEquals(in, Ex3.moveCharToLast(in,'*'));
			in = "";
			assertEquals(in, Ex3.moveCharToLast(in,'o'));
			in = "hihi&&&";
			assertEquals(in, Ex3.moveCharToLast(in,'&'));
		}

		//  2 points
		@Test
		void testMoveCharToLastEdgeCases2() {
			String in = "";
			assertEquals(in, Ex3.moveCharToLast(in,'o'));
		}

		//  2 points
		@Test
		void testMoveCharToLastEdgeCases3() {
			String in = "hihi&&&";
			assertEquals(in, Ex3.moveCharToLast(in,'&'));
		}

		//  1 point
		@Test
		void testReduce() {
			String in = "aaabbccccxxxyzz";
			String out = "abcxyz";
			assertTrue(out.equals(Ex3.reduce(in)));
		}

		//  1 point
		@Test
		void testReduce2() {
			String in = "abcda";
			assertTrue(in.equals(Ex3.reduce(in)));
		}

		//  1 point
		@Test
		void testReduceMoreTests() {
			String in = "aaabbccccxxxyzz&&&&&&&^^^^^^^^^^%%%%%";
			String out = "abcxyz&^%";
			assertTrue(out.equals(Ex3.reduce(in)));
		}

		//  1 point
		@Test
		void testReduceMoreTests2() {
			String in = "abcxyz&^%";
			String out = in;
			assertTrue(out.equals(Ex3.reduce(in)));
		}

		//  1 point
		@Test
		void testReduceMoreTests3() {
			String in = "Apples    and banannnnas";
			String out = "Aples and bananas";
			assertEquals(out, Ex3.reduce(in));
		}

		//  1 point
		@Test
		void testReduceMoreTests4() {
			String in = "hihihihihih";
			String out = in;
			assertEquals(out, Ex3.reduce(in));
		}

		//  1 point
		@Test
		void testReduceMoreTests5() {
			String in = "hhhhhhhhhhhhhhhhhiiiiiiiiiiiya";
			String out = "hiya";
			assertEquals(out, Ex3.reduce(in));
		}

		//  1 point
		@Test
		void testReduceMoreTests6() {
			String in = "hello world, let's go!";
			String out = "helo world, let's go!";
			assertEquals(out, Ex3.reduce(in));
		}

		//  1 point
		@Test
		void testReduceMoreTests7() {
			String in = "heo word, et's go!llll";
			String out = "heo word, et's go!l";
			assertEquals(out, Ex3.reduce(in));
		}

		//  2 points
		@Test
		void testReduceEdgeCases() {
			String in = "  ";
			String out = " ";
			assertTrue(out.equals(Ex3.reduce(in)));
		}

		//  2 points
		@Test
		void testReduceEdgeCases2() {
			String in = " ";
			String out = in;
			assertTrue(out.equals(Ex3.reduce(in)));
		}

		//  2 points
		@Test
		void testReduceEdgeCases3() {
			String in = "";
			String out = in;
			assertTrue(out.equals(Ex3.reduce(in)));
		}

		//  1 point
		@Test
		void testMySplit() {
			assertEquals(Ex3.mySplit(new int[] {1,1}),true);
		}

		//  1 point
		@Test
		void testMySplit2() {
			assertEquals(Ex3.mySplit(new int[] {1,1,1}),false);
		}

		//  1 point
		@Test
		void testMySplit3() {
			assertEquals(Ex3.mySplit(new int[] {2,4,2}),true);
		}

		//  1 point
		@Test
		void testMySplit4() {
			assertEquals(Ex3.mySplit(new int[] {5,21,8,15,7}),true);
		}

		//  1 point
		@Test
		void testMySplit5() {
			assertEquals(Ex3.mySplit(new int[] {15,10,5}),false);
		}

		//  1 point
		@Test
		void testMySplit6() {
			assertEquals(Ex3.mySplit(new int[] {15,8,7}),true);
		}

		//  2 points
		@Test
		void testMySplitMoreTests() {
			assertTrue(Ex3.mySplit(new int[] {1,2,3}));
		}

		//  2 points
		@Test
		void testMySplitMoreTests2() {
			assertTrue(Ex3.mySplit(new int[] {1,2,1}));
		}

		//  2 points
		@Test
		void testMySplitMoreTests3() {
			assertFalse(Ex3.mySplit(new int[] {2,5,2}));
		}

		//  2 points
		@Test
		void testMySplitMoreTests4() {
			assertTrue(Ex3.mySplit(new int[] {5,21,21,8,25,20}));
		}

		//  2 points
		@Test
		void testMySplitMoreTests5() {
			assertFalse(Ex3.mySplit(new int[] {5,22,21,8,25,20}));
		}

		//  2 points
		@Test
		void testMySplitMoreTests6() {
			assertFalse(Ex3.mySplit(new int[] {3,3,2}));
		}

		//  2 points
		@Test
		void testMySplitMoreTests7() {
			assertTrue(Ex3.mySplit(new int[] {3,8,3,2}));
		}

		//  2 points
		@Test
		void testMySplitMoreTests8() {
			assertTrue(Ex3.mySplit(new int[] {14,8,7,1}));
		}

		//  2 points
		@Test
		void testMySplitMoreTests9() {
			assertFalse(Ex3.mySplit(new int[] {3,3,3}));
		}

		//  2 points
		@Test
		void testMySplitMoreTests10() {
			assertTrue(Ex3.mySplit(new int[] {1,4,5,3,6,3,6,8,28,4,2,4}));
		}

		//  2 points
		@Test
		void testMySplitMoreTests11() {
			assertFalse(Ex3.mySplit(new int[] {5,3,8}));
		}

		//  2 points
		@Test
		void testMySplitMoreTests12() {
			int[] array = new int[35];
			int j = 1;
			for (int i = 0; i < array.length; i++) {
				if (j % 15 == 0 || j % 13 == 0 || j % 19 == 0) {
					j++;
					i--;
				}
				else {
					array[i] = j++;
				}
			}
			assertFalse(Ex3.mySplit(array));
		}

		//  1 point
		@Test
		void testSumOfNeighbours() {
			int[][] mat1 = {{3,5,7,5},{-4,2,10,11},{9,-50,3,60}};
			int[][] matOut1 = {{3,18,33,28},{-31,-17,43,85},{-52,20,33,24}};
			mat1 = Ex3.sumOfNeighbours(mat1);
			for(int i=0; i < mat1.length ;++i)
				assertTrue(Arrays.equals(mat1[i], matOut1[i]));

			int[][] mat2 = {{1,-2},{4,1}};
			int[][] matOut2 = {{3,6},{0,3}};
			mat2 = Ex3.sumOfNeighbours(mat2);
			for(int i=0; i < mat2.length ;++i)
				assertTrue(Arrays.equals(mat2[i], matOut2[i]));
		}

		//  1 point
		@Test
		void testSumOfNeighbours2() {
			int[][] mat2 = {{1,-2},{4,1}};
			int[][] matOut2 = {{3,6},{0,3}};
			mat2 = Ex3.sumOfNeighbours(mat2);
			for(int i=0; i < mat2.length ;++i)
				assertTrue(Arrays.equals(mat2[i], matOut2[i]));
		}

		//  1 point
		@Test
		void testSumOfNeighboursMoreTests() {
			int[][] mat1 = {{3,5,7,5},
					{-3,22,10,11},
					{9,-50,3,60}};
			int[][] matOut1 = {{24,39,53,28},
					{-11,-16,63,85},
					{-31,41,53,24}};
			mat1 = Ex3.sumOfNeighbours(mat1);
			for(int i=0; i < mat1.length ;++i)
				assertArrayEquals(mat1[i], matOut1[i]);
		}

		//  1 point
		@Test
		void testSumOfNeighboursMoreTests2() {
			int[][] mat2 = {{1,-7},{29,-11}};
			int[][] matOut2 = {{11,19},{-17,23}};
			mat2 = Ex3.sumOfNeighbours(mat2);
			for(int i=0; i < mat2.length ;++i)
				assertArrayEquals(mat2[i], matOut2[i]);
		}

		//  1 point
		@Test
		void testSumOfNeighboursMoreTests3() {
			int[][] mat3 = {{3,5,7,5},
					{-3,22,10,11}};
			int[][] matOut3 = {{24,39,53,28},
					{30,22,50,22}};
			mat3 = Ex3.sumOfNeighbours(mat3);
			for(int i=0; i < mat3.length ;++i)
				assertArrayEquals(mat3[i], matOut3[i]);
		}

		//  1 point
		@Test
		void testSumOfNeighboursMoreTests4() {
			int[][] mat4 = {{3,5},
					{-3,22},
					{9,-50},
					{1,2},
					{0,24},
					{3,-23},
					{4,-3},
					{-2,3}};
			int[][] matOut4 = {{24,22},
					{-11,-36},
					{-28,31},
					{-15,-16},
					{7,-17},
					{2,28},
					{-22,-15},
					{4,-1}};
			mat4 = Ex3.sumOfNeighbours(mat4);
			for(int i=0; i < mat4.length ;++i)
				assertArrayEquals(mat4[i], matOut4[i]);
		}

		//  1 point
		@Test
		void testSumOfNeighboursMoreTests5() {
			int[][] mat5 = {{3,5},
					{-3,22},
					{9,-50}};
			int[][] matOut5 = {{24,22},
					{-11,-36},
					{-31,28}};
			mat5 = Ex3.sumOfNeighbours(mat5);
			for(int i=0; i < mat5.length ;++i)
				assertArrayEquals(mat5[i], matOut5[i]);
		}

		//  1 point
		@Test
		void testSumOfNeighboursMoreTests6() {
			int[][] mat6 = {{0,0,0},
					{0,0,0},
					{0,0,0}};
			int[][] matOut6 = {{0,0,0},
					{0,0,0},
					{0,0,0}};
			mat6 = Ex3.sumOfNeighbours(mat6);
			for(int i=0; i < mat6.length ;++i)
				assertArrayEquals(mat6[i], matOut6[i]);
		}

		//  1 point
		@Test
		void testSumOfNeighboursMoreTests7() {
			int[][] mat7 = {{3,5,7,5,1,4,2,8},
					{-3,22,10,11,1,4,5,-39},
					{9,-50,3,-29,0,-12,45,93}};
			int[][] matOut7 = {{24, 39, 53, 30, 25, 13, -18, -32},
					{-11, -16, -26, -2, -16, 46, 105, 153},
					{-31, 41, -36, 25, -25, 55, 51, 11}};
			mat7 = Ex3.sumOfNeighbours(mat7);
			for(int i=0; i < mat7.length ;++i)
				assertArrayEquals(mat7[i], matOut7[i]);
		}

		//  2 points
		@Test
		void testSumOfNeighboursEdgeCases() {
			int[][] mat1 = {{3,5,7,5},{-4,2,10,11},{9,-50,3,60}};
			int[][] matOut1 = Ex3.sumOfNeighbours(mat1);
			assertNotSame(mat1, matOut1);
		}

		//  2 points
		@Test
		void testSumOfNeighboursEdgeCases2() {
			int[][] mat2 = {{1,-2},{4,1}};
			int[][] matOut2 = {{3,6},{0,3}};
			mat2 = Ex3.sumOfNeighbours(mat2);
			assertNotSame(mat2, matOut2);
		}

		//  2 points
		@Test
		void testSumOfNeighboursEdgeCases3() {
			int[][] mat3 = Ex3.sumOfNeighbours(new int[][]{{3,5,7,5},{-4,2,10,11},{9,-50,3,60}});
			int[][] matOut3 = {{-30, 31, 157, 161},{-28, 67, 224, 161},{-28, -24, 155, 161}};
			mat3 = Ex3.sumOfNeighbours(mat3);
			for(int i=0; i < mat3.length ;++i)
				assertArrayEquals(mat3[i], matOut3[i]);
		}

		//  1 point
		@Test
		void testCaesarCipherText() {
			String in = "abcdefghijklmnopqrstuvwxyz ";
			String out = "efghijklmnopqrstuvwxyzabcd ";
			assertTrue(out.equals(Ex3.caesarCipherText(in, 4)));
			assertTrue(in.equals(Ex3.caesarCipherText(Ex3.caesarCipherText(in, 4),-4)));
		}

		//  1 point
		@Test
		void testCaesarCipherText2() {
			String in = "abcdefghijklmnopqrstuvwxyz ";
			assertTrue(in.equals(Ex3.caesarCipherText(Ex3.caesarCipherText(in, 4),-4)));
		}

		//  1 point
		@Test
		void testCaesarCipherTextMoreTests() {
			String in = "abcd e   fgh  ijklmnopqrstuvwxyz ";
			String out = "efgh i   jkl  mnopqrstuvwxyzabcd ";
			assertEquals(Ex3.caesarCipherText(Ex3.caesarCipherText(in, 2),2), out);
		}

		//  1 point
		@Test
		void testCaesarCipherTextMoreTests2() {
			String in = "abcd e   fgh  ijklmnopqrstuvwxyz ";
			String out = in;
			assertEquals(Ex3.caesarCipherText(Ex3.caesarCipherText(in, -3),3), out);
		}

		//  1 point
		@Test
		void testCaesarCipherTextMoreTests3() {
			String in = "hello world lets go";
			String out = in;
			assertEquals(Ex3.caesarCipherText(Ex3.caesarCipherText(in, 26),26), out);
		}

		//  1 point
		@Test
		void testCaesarCipherTextMoreTests4() {
			String in = "hello world lets go";
			String out = in;
			assertEquals(Ex3.caesarCipherText(Ex3.caesarCipherText(in, -26),-26), out);
		}

		//  1 point
		@Test
		void testCaesarCipherTextMoreTests5() {
			String in = "i think therefore i am";
			String out = "z kyzeb kyvivwfiv z rd";
			assertEquals(Ex3.caesarCipherText(in, 17), out);
		}

		//  1 point
		@Test
		void testCaesarCipherTextMoreTests6() {
			String in = "hakuna matata";
			String out = "unxhan zngngn";
			assertEquals(Ex3.caesarCipherText(in, 13), out);
		}

		//  1 point
		@Test
		void testCaesarCipherTextMoreTests7() {
			String in = "unxhan zngngn";
			String out = "mfpzsf rfyfyf";
			assertEquals(Ex3.caesarCipherText(in, -8), out);
		}

		//  1 point
		@Test
		void testCaesarCipherTextEdgeCases() {
			String in = "abcdefghijklmnopqrstuvwxyz ";
			String out;
			assertEquals(Ex3.caesarCipherText(in, 27), "");
			in = "           ";
			out = in;
			assertEquals(Ex3.caesarCipherText(in,-4), out);
			assertEquals(Ex3.caesarCipherText(in,Integer.MIN_VALUE), "");
		}

		//  1 point
		@Test
		void testCaesarCipherTextEdgeCases2() {
			String in = "           ";
			String out = in;
			assertEquals(Ex3.caesarCipherText(in,-4), out);
		}

		//  1 point
		@Test
		void testCaesarCipherTextEdgeCases3() {
			String in = "           ";
			assertEquals(Ex3.caesarCipherText(in,Integer.MIN_VALUE), "");
		}

		//  1 point
		@Test
		void testVigenereCipherText() {
			String in = "a simple example";
			String out = "a zqqkpq rqaowti";
			assertTrue(out.equals(Ex3.vigenereCipherText(in, "achievement")));
			in = "impressive student from ariel university";
			out = "pacfvzgvjv ggiulbg wycz rywrz bbvjvygvhp";
			assertTrue(out.equals(Ex3.vigenereCipherText(in, "honor")));
			in = "test";
			out = "test";
			assertTrue(out.equals(Ex3.vigenereCipherText(in, "a")));
		}

		//  1 point
		@Test
		void testVigenereCipherText2() {
			String in = "impressive student from ariel university";
			String out = "pacfvzgvjv ggiulbg wycz rywrz bbvjvygvhp";
			assertTrue(out.equals(Ex3.vigenereCipherText(in, "honor")));
		}

		//  1 point
		@Test
		void testVigenereCipherText3() {
			String in = "test";
			String out = "test";
			assertTrue(out.equals(Ex3.vigenereCipherText(in, "a")));
		}

		//  1 point
		@Test
		void testVigenereCipherTextMoreTests() {
			String in = "but where do i go from here so many voices ringing "
					+ "in my ear which is the voice that i was meant to hear";
			String out = "toi njecm uo q og ntsj pecm gq aufq kszeed wznmqyo "
					+ "bv qv mac zvkkv ak ilv vzqhv zplb b yep uelvw vw bwsl";
			String key = "supercalifragilisticexpialidocious";
			assertEquals(Ex3.vigenereCipherText(in, key), out);
		}

		//  1 point
		@Test
		void testVigenereCipherTextMoreTests2() {
			String in = "do i whaaatt";
			String out = "fc w wcirulv";
			String key = "coronavirus";
			assertEquals(Ex3.vigenereCipherText(in, key), out);
		}

		//  1 point
		@Test
		void testVigenereCipherTextMoreTests3() {
			String in = "first google it before you send an email";
			String out = "xbrud ujsxqp el bgpHfz ptf owgd ka zqrnw";
			String key = "stack overflow";
			assertEquals(Ex3.vigenereCipherText(in, key), out);
		}

		//  1 point
		@Test
		void testVigenereCipherTextMoreTests4() {
			String in = "did you google it  ";
			String out = "chc xnt fnnfkd hs  ";
			String key = "z";
			assertEquals(Ex3.vigenereCipherText(in, key), out);
		}

		//  2 points
		@Test
		void testVigenereDecipherText() {
			String in = "a simple example";
			String key = "achievement";
			assertTrue(in.equals(Ex3.vigenereDecipherText(Ex3.vigenereCipherText(in,key),key)));
		}

		//  2 points
		@Test
		void testVigenereDecipherTextMoreTests() {
			String in = "keep it  simple ";
			String key = "easy";
			assertTrue(in.equals(Ex3.vigenereDecipherText(Ex3.vigenereCipherText(in,key),key)));
		}

		//  2 points
		@Test
		void testVigenereDecipherTextMoreTests2() {
			String in = "asj ag eoe";
			String key = "correct";
			String out = "yes we can";
			assertEquals(Ex3.vigenereDecipherText(in,key), out);
		}

	}




