/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Asus
 */
class Member {
    private String name;
    
    public Member(String name) { 
        this.name= name;
    }
    
    public void infoMember() {
        System.out.println("Member Name: " + name);
    }
}

class Club {
    private String nameClub;
    private List<Member> memberList;
    
    public Club(String nameClub) {
        this.nameClub = nameClub;
        this.memberList = new ArrayList<>();
    }
    
    public void addMember(Member member) {
        memberList.add(member);
    }
    
    public void infoClub() {
        System.out.println("Club name: " + nameClub);
        for (Member anggota : memberList) {
            anggota.infoMember();
        }
    }
}