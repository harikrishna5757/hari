# animal_module.py

from abc import ABC, abstractmethod


class Animal(ABC):
    @abstractmethod
    def make_sound(self):
        pass


class Dog(Animal):
    def make_sound(self):
        return "Bark"


class Cat(Animal):
    def make_sound(self):
        return "Meow"


def _create_animal(animal_type: str) -> Animal:
    if animal_type == "dog":
        return Dog()
    elif animal_type == "cat":
        return Cat()
    else:
        raise ValueError("Unknown animal type")


def animal_sound(animal_type: str):
    animal = _create_animal(animal_type)
    print(animal.make_sound())
