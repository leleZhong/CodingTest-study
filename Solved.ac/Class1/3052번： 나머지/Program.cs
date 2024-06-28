/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 3052                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/3052                           #+#        #+#      #+#    */
/*   Solved: 2024/06/28 20:11:22 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
List<int> input = new List<int>();

for (int i = 0; i < 10; i++)
{
    input.Add(int.Parse(Console.ReadLine()) % 42);
}
for (int i = 0; i < input.Count; i++)
{
    for (int j = i + 1; j < input.Count; j++)
    {
        if (input[i] == input[j])
        {
            input.RemoveAt(j);
            j--;
        }
    }
}
Console.WriteLine(input.Count);