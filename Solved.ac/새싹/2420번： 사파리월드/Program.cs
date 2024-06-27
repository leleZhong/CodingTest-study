/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2420                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2420                           #+#        #+#      #+#    */
/*   Solved: 2024/06/27 17:43:08 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
string[] input = Console.ReadLine().Split();
long n = int.Parse(input[0]);
long m = int.Parse(input[1]);
long output = n - m;

if (output < 0)
    output *= -1;

Console.WriteLine(output);