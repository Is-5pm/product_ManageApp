package org.ssg.product_manageapp.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.ssg.product_manageapp.dto.ProductDTO;
import org.ssg.product_manageapp.service.ProductService;

import javax.validation.Valid;

@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/list")
    public void getList(Model model) {
        log.info("list calling ...");
        model.addAttribute("dtoList", productService.getList());
    }
    @GetMapping("/insert")
    public void insert(){
        log.info("product insert...");
    }
    @PostMapping("/insert")
    public String insertProduct(@Valid ProductDTO productDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        log.info("insert product...");

        if (bindingResult.hasErrors()) {
            log.error("has errors...");
            redirectAttributes.addFlashAttribute("errors", bindingResult.getAllErrors()); // 바인딩 처리
            return "redirect:/product/add";
        }

        productService.insert(productDTO);

        return  "redirect:/product/list";
    }


    @GetMapping("/remove")
    public String remove(Long pno) {
        log.info("remove......");
        productService.remove(pno);

        return "redirect:/product/list";
    }

    @PostMapping("/modify")
    public String modify(@Valid ProductDTO productDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        log.info("modify info of product...");

        if (bindingResult.hasErrors()) {
            log.error("has errors...");
            redirectAttributes.addFlashAttribute("errors", bindingResult.getAllErrors());
            return "redirect:/product/modify";
        }

        productService.modify(productDTO);

        return "redirect:/product/list";
    }
    @GetMapping("/modify")
    public void readOne(Long id, Model model) {
        log.info("get one ...");
        log.info(id);
        ProductDTO productDTO = productService.getOne(id);
        model.addAttribute("dto", productDTO);
    }
}
