package org.example.programmers.level2;

import java.util.Arrays;

public class level2스킬트리 {
    public static void main(String[] args) {
        solve("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"}); //2
    }

    static void solve(String skill, String[] skill_trees) {
        int answer = 0;
        for (String skillTr : skill_trees) {
            String masterSkillTree = skillTr;

            for (int i = 0; i < skillTr.length(); i++) {
                String value = skillTr.substring(i, i + 1); // 한글자씩 체크
                if (!skill.contains(value)) {
                    masterSkillTree = masterSkillTree.replace(value, "");
                }
            }
            System.out.println(masterSkillTree);
            System.out.println(skill.indexOf(masterSkillTree));
            if (skill.indexOf(masterSkillTree) == 0) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
