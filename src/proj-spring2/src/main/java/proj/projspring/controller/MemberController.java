package proj.projspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import proj.projspring.domain.Member;
import proj.projspring.domain.MemberForm;
import proj.projspring.service.MemberService;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    private MemberService service;

    @GetMapping("/")
    public String member(Model model){
        return "member";
    }

    @GetMapping(value = "/members/new")
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
        List<Member> lists = service.findAll();
        model.addAttribute( "lists", lists);


        return "members/memberList";
    }

    @GetMapping(value = "/members2")
    public String list2(Model model){
        List<Member> lists = service.findAll();

        model.addAttribute("lists", lists);

        return "thymeleaf/thymeleaf01";
    }

    @GetMapping(value = "/members3")
    public String list3(Model model){
        List<Member> lists = service.findAll();

        model.addAttribute("lists", lists);

        return "thymeleaf/thymeleaf02";
    }

}
