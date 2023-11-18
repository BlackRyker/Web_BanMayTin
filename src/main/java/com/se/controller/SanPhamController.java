package com.se.controller;

import com.se.entity.SanPham;
import com.se.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/sanpham")
public class SanPhamController {

    @Autowired
    private SanPhamService sanPhamService;

    @GetMapping("/")
    public String getAllSanPham(Model model) {
        List<SanPham> sanPhams = sanPhamService.getAllSanPham();
        model.addAttribute("sanPhams", sanPhams);
        return "WEB-INF/view/sanpham-list";
    }

    @GetMapping("/{id}")
    public String getSanPhamById(@PathVariable int id, Model model) {
        SanPham sanPham = sanPhamService.getSanPhamById(id);
        model.addAttribute("sanPham", sanPham);
        return "WEB-INF/view/sanpham-detail";
    }

    @PostMapping("/")
    public String saveSanPham(@ModelAttribute("sanPham") SanPham sanPham) {
        sanPhamService.saveSanPham(sanPham);
        return "redirect:/sanpham/";
    }

    @GetMapping("/delete/{id}")
    public String deleteSanPham(@PathVariable int id) {
        sanPhamService.deleteSanPham(id);
        return "redirect:/sanpham/";
    }
}