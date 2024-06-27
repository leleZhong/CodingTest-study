/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10952                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10952                          #+#        #+#      #+#    */
/*   Solved: 2024/06/27 22:32:57 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
int a, b;
List<int> output = new List<int>();

while(true)
{
    string[] input = Console.ReadLine().Split();
    a = int.Parse(input[0]);
    b = int.Parse(input[1]);

    if (a == 0 && b == 0)
        break;
    output.Add(a + b);
}

for (int i = 0; i < output.Count; i++)
{
    Console.WriteLine(output.ElementAt(i));
}