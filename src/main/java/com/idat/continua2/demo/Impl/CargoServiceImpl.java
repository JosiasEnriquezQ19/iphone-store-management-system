package com.idat.continua2.demo.Impl;

import com.idat.continua2.demo.Repository.CargoRepository;
import com.idat.continua2.demo.Service.CargoService;
import com.idat.continua2.demo.model.CargoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Implementación del servicio para gestión de Cargos
 * Proporciona operaciones CRUD y lógica de negocio básica
 * Integra con CargoRepository para persistencia
 */
@Service
@Transactional
public class CargoServiceImpl implements CargoService {

    @Autowired
    private CargoRepository cargoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<CargoEntity> findAll() {
        return cargoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<CargoEntity> findById(Integer id) {
        return cargoRepository.findById(id);
    }

    @Override
    public CargoEntity add(CargoEntity cargo) {
        return cargoRepository.save(cargo);
    }

    @Override
    public CargoEntity update(CargoEntity cargo) {
        return cargoRepository.save(cargo);
    }

    @Override
    public void delete(Integer id) {
        cargoRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<CargoEntity> findByNombre(String nombre) {
        return cargoRepository.findByNombre(nombre);
    }

    @Override
    @Transactional(readOnly = true)
    public Long countAll() {
        return cargoRepository.count();
    }
}