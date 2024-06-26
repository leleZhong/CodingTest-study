/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2588                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2588                           #+#        #+#      #+#    */
/*   Solved: 2024/06/26 15:27:18 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
string num1 = Console.ReadLine();
string num2 = Console.ReadLine();
int[] num2Arr = Array.ConvertAll(num2.ToCharArray(), c => int.Parse(c.ToString()));

int first = int.Parse(num1);
int second = int.Parse(num2);

int third = first * num2Arr[2];
int fourth = first * num2Arr[1];
int fifth = first * num2Arr[0];
int sixth = first * second;

Console.WriteLine(third);
Console.WriteLine(fourth);
Console.WriteLine(fifth);
Console.WriteLine(sixth);