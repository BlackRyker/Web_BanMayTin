package com.se.controller;

import com.se.entity.ChiTietGH;
import com.se.entity.GioHang;
import com.se.entity.SanPham;
import com.se.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String getHome(Model model) {
		List<SanPham> sanPhams = userService.getAllSanPham();
		model.addAttribute("sanPhams", sanPhams);
		return "user-home";
	}

	@GetMapping("/admin")
	public String getAdmin(Model model) {
		List<SanPham> sanPhams = userService.getAllSanPham();
		model.addAttribute("sanPhams", sanPhams);
		return "admin";
	}

	@GetMapping("/product")
	public String getSanPhamByIdInHome(@RequestParam("productId") int id, Model model) {
		SanPham sanPham = userService.getSanPhamById(id);
		model.addAttribute("sanPham", sanPham);

		List<SanPham> sanPhams = userService.getAllSanPham();
		model.addAttribute("sanPhams", sanPhams);
		return "user-product";
	}

	@GetMapping("/product/add")
	public String addSanPham(@RequestParam("maSp") int maSp,Model model) {
		GioHang gioHang = new GioHang();
		gioHang.setMaGh(1);
		SanPham sanPham = userService.getSanPhamById(maSp);
		ChiTietGH chiTietGH = new ChiTietGH(gioHang, sanPham, 1);
		userService.addSanPham(chiTietGH);
		model.addAttribute("sanPham", sanPham);
		
		return "user-product";
	}
	
	@GetMapping("/product/delete")
	public String deleteSanPham(@RequestParam("maSp") int maSp,Model model) {
		userService.deleteChiTietGh(maSp);
		List<ChiTietGH> chiTietGHs = userService.getAllChiTietSpInGh(1);
		model.addAttribute("carts", chiTietGHs);
		return "user-cart";
	}


	@GetMapping("/cart")
	public String getCart(Model model) {
		List<ChiTietGH> chiTietGHs = userService.getAllChiTietSpInGh(1);
		model.addAttribute("carts", chiTietGHs);
		return "user-cart";
	}
	
	
	@GetMapping("/admin/product/add")
	public String showFormAdd(Model theModel) {
		SanPham sanPham = new SanPham();
		theModel.addAttribute("sanPham", sanPham);
		return "admin-product-add";

	}

	@PostMapping("/admin/product/save")
	public String saveSanPham(@ModelAttribute("sanPham") SanPham sanPham) {
		userService.saveSanPham(sanPham);
		return "redirect:/admin";
	}

	@GetMapping("/admin/product/{id}")
	public String getSanPhamByIdInAdmin(@PathVariable int id, Model model) {
		SanPham sanPham = userService.getSanPhamById(id);
		model.addAttribute("sanPham", sanPham);
		return "admin-product-update";
	}

	

	@GetMapping("/admin/product")
	public String getSanPhamInAdmin(Model model) {
		List<SanPham> sanPhams = userService.getAllSanPham();
		model.addAttribute("sanPhams", sanPhams);
		return "admin-product";
	}

	@GetMapping("/admin/product/customer")
	public String showFormCustomer(Model theModel) {
		SanPham sanPham = new SanPham();
		theModel.addAttribute("sanPham", sanPham);
		return "admin-customer";

	}

	@GetMapping("/admin/product/report")
	public String showFormReport(Model theModel) {
		SanPham sanPham = new SanPham();
		theModel.addAttribute("sanPham", sanPham);
		return "admin-report";

	}
}