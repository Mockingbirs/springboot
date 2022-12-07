package proj.projspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import proj.projspring.domain.Member;
import proj.projspring.domain.MemberForm;
import proj.projspring.service.MemberService;

@Controller
public class MemberController {

    @Autowired
    private MemberService service;

    @GetMapping("/")
    public String home(){

        return "member";
    }

    @GetMapping("/members/new")
    public String createForm(){
        return "members/createMemberForm";
    }

    @PostMapping(value = "/members/new")
    public String create(MemberForm form){
    Member member = new Member();

    member.setName(form.getName());

    Long id = service.join(member);

    System.out.println("=> 아이디 : " + id);

    return "redirect:/";
    }

    @GetMapping(value = "/members")
    public String list(Model model){
        service.findAll();

        return null;
    }
}
